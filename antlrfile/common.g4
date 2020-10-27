grammar common;
//剧本
script: (stmt Dot?)+ ;
//语句：简单句；
stmt: simpleStmt;

//简单句：执行类命令
simpleStmt: actionStmt;
//执行类命令：谓宾 do something stmt；
actionStmt: doSmtStmt;
//谓宾：谓语 宾语；
doSmtStmt: verb obj;

//谓语：显示；
verb: Show | Execute | Delete | Search;
//宾语：简单一个str；
obj: Str | LeaveTool | PeopleName;

Dot: '.' | '。';
Show: '显示';
Execute: '执行';
Delete: '删除';
Search: '查找';
Str: 'helloworld';
LeaveTool: '请假工具';
PeopleName: '张三';