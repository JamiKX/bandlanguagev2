package com.common.environment;

import com.common.environment.staticMessage.EnvironmentType;
import com.common.environment.wetoband.BLObj;
import com.common.environment.wetoband.Band;
import com.common.environment.wetoband.Const;
import com.common.environment.wetoband.Organization;
import com.common.node.word.object.Str;
import com.common.utils.Tool;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 语境
 */
public class Environment {
    public Organization organization; //该剧本的机构环境(帮区环境在里面，但不从这里访问)
    public Band band; //该剧本的帮区环境(在这里访问帮区环境)
    public List<BLObj> scriptEnvironment; //剧本内部环境
    public int place; //分割全局环境和单句环境的标识，其中0-place为全局环境，place之后是单句环境(包括place)

    //存储要显示给用户的内容
    public HashMap<String,Object> showForUser = new HashMap<String,Object>();

    //保存用户选择的句子的执行方法，按照句子顺序进行存储和拿取
    public Queue<String> methodChoosed = new LinkedList<String>();

    public Environment(){
        String oname = Tool.getOrganizationName();
        String bname = Tool.getBandName();
        //初始化机构环境
        List<Organization> olists = Const.organizations;
        for (Organization a :olists){
            if(a.name.equals(oname)){
                this.organization = a;
            }
        }
        //初始化帮区环境
        List<Band> blists = this.organization.bands;
        for (Band a :blists){
            if(a.name.equals(bname)){
                this.band = a;
            }
        }
        this.scriptEnvironment = new LinkedList<BLObj>();
        this.place = 0;
    }

    /**
     * 在语境中，查找某一个词所对应的具体内容
     * 查找顺序: 单句环境-全局环境-帮区环境-机构环境
     * @param key 词
     * @return
     */
    public Object find(String key){
        Object res = null;
        res = findInStack(key);
        if(res != null){
            return res;
        }

        res = findInMemeory(key);
        if(res != null){
            return res;
        }

        res = findInBand(key);
        if(res != null){
            return res;
        }

        res = findInOrganization(key);
        if(res != null){
            return res;
        }

        return null;
    }

    /**
     * 在固定一个环境中查找该词对应的内容
     * @param key 词
     * @param type 选择的环境
     * @return
     */
    public Object find(String key, EnvironmentType type){
        switch (type){
            case ORGANIZATION:
                return findInOrganization(key);
            case BAND:
                return findInBand(key);
            case MEMORY:
                return findInMemeory(key);
            case STACK:
                return findInStack(key);
            default: return null;
        }
    }

    /**
     * 在某个环境中，加入一个对象
     * @param key 中文名称
     * @param value 内容
     * @param type 选择的环境
     */
    public void add(String key,Object value,EnvironmentType type){
        switch (type){
            case ORGANIZATION:
                addInOrganization(key,value);
                break;
            case BAND:
                addInBand(key,value);
                break;
            case MEMORY:
                addInMemory(key,value);
                break;
            case STACK:
                addInStack(key,value);
                break;
            default: return ;
        }
    }

    /**
     * 在某个环境中，删除一个对象
     * @param key 中文名称
     * @param type 选择的环境
     */
    public boolean delete(String key,EnvironmentType type){
        switch (type){
            case ORGANIZATION:
                return deleteInOrganization(key);
            case BAND:
                return deleteInBand(key);
            case MEMORY:
                return deleteInMemory(key);
            case STACK:
                return deleteInStack(key);
            default: return false;
        }
    }

    /**
     * 在单句环境中查找key所对应的内容
     * @param key
     * @return
     */
    private Object findInStack(String key){
        for(int i=this.scriptEnvironment.size()-1;i>=this.place;i--){
            BLObj blObj = this.scriptEnvironment.get(i);
            if(blObj.key.equals(key)){
                return blObj.value;
            }
        }
        return null;
    }

    /**
     * 在全局环境中查找key所对应的内容
     * @param key
     * @return
     */
    private Object findInMemeory(String key){
        for(int i=0;i<this.place;i++){
            BLObj blObj = this.scriptEnvironment.get(i);
            if(blObj.key.equals(key)){
                return blObj.value;
            }
        }
        return null;
    }

    /**
     * 在帮区环境中查找key所对应的内容
     * @param key
     * @return
     */
    private Object findInBand(String key){
        for(BLObj blObj : this.band.things){
            if(blObj.key.equals(key)){
                return blObj.value;
            }
        }
        return null;
    }

    /**
     * 在帮区环境中查找key所对应的内容
     * @param key
     * @return
     */
    private Object findInOrganization(String key){
        for(BLObj blObj : this.organization.things){
            if(blObj.key.equals(key)){
                return blObj.value;
            }
        }
        return null;
    }

    /**
     * 将对象插入到单句环境中
     * @param key 中文名称
     * @param value 值
     * @return
     */
    private void addInStack(String key ,Object value){
        BLObj obj = new BLObj(key,value);
        scriptEnvironment.add(obj);
    }

    /**
     * 将对象插入到全局环境中
     * @param key 中文名称
     * @param value 值
     * @return
     */
    private void addInMemory(String key ,Object value){
        BLObj obj = new BLObj(key,value);
        scriptEnvironment.add(place,obj);
        place++;
    }

    /**
     * 将对象插入到帮区环境中
     * @param key 中文名称
     * @param value 值
     * @return
     */
    private void addInBand(String key ,Object value){
        BLObj obj = new BLObj(key,value);
        this.band.things.add(obj);
    }

    /**
     * 将对象插入到机构环境中
     * @param key 中文名称
     * @param value 值
     * @return
     */
    private void addInOrganization(String key ,Object value){
        BLObj obj = new BLObj(key,value);
        this.organization.things.add(obj);
    }




    /**
     * 在单句环境中删除某个对象
     * @param key 中文名称
     * @return true表示成功删除 ，false表示没找到
     */
    private boolean deleteInStack(String key){
        for(int i=this.scriptEnvironment.size()-1;i>=this.place;i--){
            BLObj blObj = this.scriptEnvironment.get(i);
            if(blObj.key.equals(key)){
                this.scriptEnvironment.remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * 在全局环境中删除某个对象
     * @param key 中文名称
     * @return true表示成功删除 ，false表示没找到
     */
    private boolean deleteInMemory(String key){
        for(int i=0;i<this.place;i++){
            BLObj blObj = this.scriptEnvironment.get(i);
            if(blObj.key.equals(key)){
                this.scriptEnvironment.remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * 在帮区环境中删除某个对象
     * @param key 中文名称
     * @return true表示成功删除 ，false表示没找到
     */
    private boolean deleteInBand(String key){
        for(BLObj blObj : this.band.things){
            if(blObj.key.equals(key)){
                this.band.things.remove(blObj);
                return true;
            }
        }
        return false;
    }

    /**
     * 在机构环境中删除某个对象
     * @param key 中文名称
     * @return true表示成功删除 ，false表示没找到
     */
    private boolean deleteInOrganization(String key){
        for(BLObj blObj : this.organization.things){
            if(blObj.key.equals(key)){
                this.organization.things.remove(blObj);
                return true;
            }
        }
        return false;
    }



}
