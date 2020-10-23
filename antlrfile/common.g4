grammar common;
//剧本
script: (stmt Dot?)+ ;
//语句：简单句；
stmt: simpleStmt;
//谓语：显示；
verb: Show;
//宾语：简单一个str；
object: Str;
//简单句：执行类命令
simpleStmt: actionStmt;
//执行类命令：谓宾 do something stmt；
actionStmt: doSmtStmt;
//谓宾：谓语 宾语；
doSmtStmt: verb object;
Dot: '。';
Show: '显示';
Str: 'helloworld';