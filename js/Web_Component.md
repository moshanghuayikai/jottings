# Web Component
## HTML IMPORT
**作用:**在HTML文档中引入其他HTML文档对象<br/>
**使用方式：**通过链接类型`import`<br/>
具体示例<br/>
````
<link rel="import" href="other.html" async="true">
````
布尔属性`async`,true表示异步加载，false（默认值）表示等待该资源加载并渲染后再渲染后面的文档内容。<br/>
注意：`link标签`不受`media属性`所影响，始终会被获取及应用。<br/>
**HTMLLinkElement扩展**<br/>
Document? import属性,通过该属性获取被导入的文档对象。<br/>
import属性所指向的document对象，在调用open,write,close方法时会抛InvalidStateError，因为通过import方式导入的文档对象是不能调用这三个方法的。
**通过onload, onerror事件通知文档加载完成**<br/>

**注意：**
1. 多次引入同一个文档，该文档仅加载一次而已。<br/>
2. 在被引入的文档中调用document对象，该document对象指向主文档的document对象，而不是被引入的文档对象<br/>
3. 样式将根据导入的顺序执行<br/>
**参考**<br/>
http://www.tudou.com/listplay/r0pA0z77CgM/9UZ7gHj8fuM.html

## Custom Elements
1. 标签名必须含连字符

**参考**<br/>
http://www.tudou.com/listplay/r0pA0z77CgM/F7oHc5GVG08.html
