# ExportExcel

这是一个最最最简单的excel导出功能，但是往往越简单，越能看清楚这个包的使用规则。

## 项目简介
这个项目，实现了一个最简单的功能，就是查询user列表，并导出为excel表格。

由于重点想写excel的导出功能，所以本项目没有对接MySQL，只是自己伪造了3个User的信息作为返回。

### 1> 请求user信息列表
[GET]：http://localhost:8080/user

### 2> 导出user信息列表，保存为excel文件
[GET]：http://localhost:8080/user/excel

## 重点功能
引用了阿里的easyexcel包，实现导出功能，并在本项目中封装在utils下，方便所有人调用。

## ExcelUtil的使用介绍
```java
public class ExcelUtil {
    
    /**
       * 导出excel
       * @param response 相应response
       * @param title    保存文件的标题
       * @param head     保存excel对象的实体类
       * @param list     需要保存的数据列表
       */  
  public static void exportExcel(HttpServletResponse response, String title, Class head, List list) throws IOException {
      exportExcel(response, title, head, list, null);
  }

}
```

使用时，只需要传入三个信息即可
- title标题
- head 保存excel对象的实体类
- list 需要写入excel的数据列表