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

���ݿ�         index
��             type
row            doc
column         field




Relational DB -> Databases -> Tables -> Rows -> Columns
��ϵ�����ݿ�       ���ݿ�             ��              ��                ��
Elasticsearch -> Indices   -> Types  -> Documents -> Fields
Elasticsearch      ����               ����        �ĵ�                 ���ֶΣ�

FST����ʵ�  


1TB=1024GB��
1GB=1024MB��
1MB=1024KB��
1KB=1024B��
1B=8bit

1MB=              1024*1024*8=8388608
10MB=          10*1024*1024*8=83886080        8ǧ��
100MB=        100*1024*1024*8=838860800       8��
1G=          1024*1024*1024*8=8589934592      85��
10G=      10*1024*1024*1024*8=85899345920     858��
100G=    100*1024*1024*1024*8=858993459200    8589��

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


1ǧ��
143M   long  int  string  1
104M   int   int  string  1
123M   int   int  string  3

11111111

idx4 4:wangwu:3:[1,2;3,1;7,1]
word   fst
skiplist

����   json .conf
���ݿ� db
�� table
��¼ record

�ʵ� fst
����(�ڴ桢����)
�����ڴ�ṹ
�� �� ��ѯ
���� ʱ������





Ҫ��
�ֲ�ʽ
ʵʱ
�ȶ�
�ĵ�
����
