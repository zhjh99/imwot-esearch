1:zhongguo zhangsan
3:zhongguo  lisi
5:wangwu lisi
7:zhongguo
8:lisi

[1,1,1,1]

idx1 1:zhongguo:3:[1,2,<2,9>;3,1,<3>;7,1,<4>]

idx2 2:zhangsan:1:[1,1,<3>]

idx3 3:lisi:3:[1,2,<2,3>]

idx4 4:wangwu:3:[1,2,<2,3>]


idx4 4:wangwu:3:[1,2;3,1;7,1]

数据库         index
表             type
row            doc
column         field




Relational DB -> Databases -> Tables -> Rows -> Columns
关系型数据库       数据库             表              行                列
Elasticsearch -> Indices   -> Types  -> Documents -> Fields
Elasticsearch      索引               类型        文档                 域（字段）

FST保存词典  


1TB=1024GB，
1GB=1024MB；
1MB=1024KB；
1KB=1024B；
1B=8bit

1MB=              1024*1024*8=8388608
10MB=          10*1024*1024*8=83886080        8千万
100MB=        100*1024*1024*8=838860800       8亿
1G=          1024*1024*1024*8=8589934592      85亿
10G=      10*1024*1024*1024*8=85899345920     858亿
100G=    100*1024*1024*1024*8=858993459200    8589亿

64G

wId:keyword
1:zhou
2:jin
3:hong


idx1 1:zhongguo:3:[1,2,<2,9>;3,1,<3>;7,1,<4>]
zhangsan:       1:[1,1,<3>]

zhongguo:3:[0,1,0,1,0,0,0,1]
zhangsan:1:[0,1,0,0,0,0,0,0]


Databases
Tables
Columns
Rows


docId wordId 






170       287     10
1.66      737     100
16.6kb    5.11kb  1000
1.62m     488kb   100000
16.2m     4.76m   1000000


1千万
143M   long  int  string  1
104M   int   int  string  1
123M   int   int  string  3

11111111

idx4 4:wangwu:3:[1,2;3,1;7,1]
word   fst
skiplist

配置   json .conf
数据库 db
表 table
记录 record

词典 fst
索引(内存、磁盘)
索引内存结构
并 或 查询
评分 时间排序





要求：
分布式
实时
稳定
文档
并发

参考网页:
https://www.cnblogs.com/huangfox/p/3524470.html

工具 sourcetree
aaa
