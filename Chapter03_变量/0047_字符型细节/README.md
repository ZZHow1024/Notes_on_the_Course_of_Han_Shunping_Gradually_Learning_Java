# 0047_字符型细节

1. 字符常量是用单引号(’ ’)括起来的单个字符。例如
    1. char c1 = 'a’;
    2. char c2 = ‘中’;
    3. char c3 = ‘9’;
2. Java中还允许使用转义字符 ’\’ 来将其后的字符转变为特殊字符型常量。例如
    1. char c3 = ‘\n’;    //  ‘\n’表示换行符
3. 在java中，char的本质是一个整数，在输出时，是unicode码对应的字符。
    
    [Unicode编码转换 - 站长工具](http://tool.chinaz.com/Tools/Unicode.aspx)
    
4. 可以直接给char赋一个整数，然后输出时，会按照对应的unicode 字符输出 [97]  —>  ‘a’
5. char类型是可以进行运算的，相当于一个整数，因为它都对应有Unicode码。
