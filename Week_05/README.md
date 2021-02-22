学习笔记

### 双向BFS
1. 记录两个beginSet 和endSet
2. 如果endSet比startSet更短,那么交换
3. BFS去匹配endSet中的值,匹配上则返回结果,没有则继续下一层
4. 将上一层生成的词加入到临时tempSet中,变成新的beginSet,重复2,3,4