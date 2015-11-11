### 代码来源
此示例中代码均来自[此处](http://blog.csdn.net/vector_yi/article/details/24719873)

### 个人理解
- MVP的一个重要理念是视图和模型解耦
- MVP中，View层和Presenter层各有交互，而Model层却不知道View层和Presenter层的存在
- 在示例中，业务逻辑从视图层中，抽离了出来，被放到了Presenter层当中，View层成了薄薄的一层。
