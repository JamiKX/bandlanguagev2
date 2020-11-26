grammar BL;
//剧本
script: (stmt Dot?)+ ;
//语句：简单句 | 复杂句；
stmt: simpleStmt | complexStmt;

//复杂句:运行工具|设定句
complexStmt:runToolStmt|setStmt|sortStmt|groupStmt;

simpleStmt:subject_predicate_object_stmt|
predicate_attribute_object_stmt|
predicate_adverbial_attribute_object_stmt|
predicate_object_stmt|
compare_stmt;


// 执行工具: “执行” <工具名称> [“其中” {<输入部件> “=” （<常量> | <另一个工具的输出部件> | <输出部件的某个属性>）} ] [ “,得到” {<输出部件> }]
runToolStmt:predicate_object_stmt (Comma Among (Comma compare_stmt)+ )? (Comma predicate_object_stmt)?;

//设定句:“设定” <术语> “=” (<有明确输出的句子> | <常量> | <输出部件> )
setStmt:Set String Equals (stmt | String | Number );

//排序句:“根据” <属性名词> “将” <输出部件> “进行” （“升序排序”|“降序排序”）
sortStmt:According String Jiang String CarryOut sort;

//分组句:“将” <数据保存的名称> “按照” <属性名称> “进行分组”
groupStmt: Jiang String According String Group;


//句子结构的划分
//谓状定宾句：谓语 状语  定语 宾语
predicate_adverbial_attribute_object_stmt:predicate adverbial attribute object;
//谓定宾句：谓语  定语 宾语
predicate_attribute_object_stmt:predicate attribute object;

//主谓宾句：主语 谓语 宾语
subject_predicate_object_stmt:subject predicate object;

//谓宾句：谓语 宾语
predicate_object_stmt:predicate object;

//比较句： 宾语 比较词 宾语
compare_stmt: object compare object;


//句子成分的划分
//主语 ： 用户名称/属性名称
subject:String;

//宾语:用户名称|工具名称|文档名称|岗位名称|对象名称|用户账号|消息板名称|帮区名称|机构名称|属性名称
//宾语:固定的某些名称，如 ***部件 、最小值
object:(String|noun) (Split (String|noun))*;

//谓语:动词
predicate:verb;
//定语：对象名称|形容词|条件判断的句子
attribute:((String|compare_stmt|adjective|noun) De)+;
//状语:时间状语|地点状语|通用状语
adverbial:place_adverbial|time_adverbial|common_adverbial;

//地点状语:在 帮区/机构/结果名称
place_adverbial:At String (In)? ;

//时间状语:在 时间
time_adverbial:At time;
//通用状语： *** 中
common_adverbial:String In;

// 词的划分
// 实词： 名词、动词、形容词、数词、量词
// 虚词： 介词、连词、助词
// 这里规定，实词的动必须规约成为一类，并规约成为主谓宾等句子结构
//而虚词，则直接在规则文件中使用

// 名词：
noun:InputPart|OutputPart|Element|Amount|Data|Max|Min|Average|time|Number;
// 动词：
verb:Show|Execute|Get|Find|Remove|Qiu|Set|Count|CarryOut|sort|Group;
// 形容词：
adjective:Old;
// 数词：
numerals:Number;
// 量词：
quantifiers:Ge;


//某些词大致是属于表示一类含义的，先统一规约一下
time:Today;
compare:Equals|NoEquals|MoreThan|NoMoreThan|LessThan|NoLessThan;
sort:SortDescending|SortAscending;

//实词
Show:'显示';
Execute:'执行';
Get:'得到';
Find:'找出';
Remove:'去掉';
Qiu:'求';
Set:'设定';
Count:'统计';
CarryOut:'进行';
SortAscending:'升序排序';
SortDescending:'降序排序';
Group:'进行分组';

Equals:'等于'|'=';
MoreThan:'大于'|'>';
LessThan:'小于'|'<';
NoEquals:'不等于'|'!=';
NoMoreThan:'不大于'|'<=';
NoLessThan:'不小于'|'>=';


InputPart:'输入部件';
OutputPart:'输出部件';
Element:'元素';
Amount:'数量';
Data:'数据';
Max:'最大值';
Min:'最小值';
Average:'平均值';

Today:'今天';

Ge:'个';

Old:'老的';

//虚词
De:'的';
Among:'其中';
In:'中';
Jiang:'将';
According:'根据'|'按照';
At:'在';

//分割符号
Comma :','|'，';
Dot :'.'|'。';
Split:'、';
//特殊处理
Number :[0-9]+;
String :([a-zA-Z0-9$_] | [\u4E00-\u9FA5])+;
Ws :[ \t\r\n]+ -> skip;
Comment :'//' ~[\r\n]* -> channel(HIDDEN);
