##����
�ṩһ����¼��־�Ŀ�ܣ����Խ���־��Ϣ��¼���ļ�������̨��Windows�¼���־�����ݿ⣨MSSQL��Acess��Oracle��DB2��SQLite�ȣ���<br/>

## ʾ��
config�����ļ�<br/>
````
<?xml version="1.0" encoding="utf-8"?>
<configuration>
<configSections>
  <section name="log4net" type="System.Configuration.IgnoreSectionHandler"/>
</configSections>
<log4net>
  <!-- ������־�����ý�� -->
  <root>
    <appender-ref ref="ConsoleAppender"/>
    <appender-ref ref="R"/>
  </root>
  <!-- �������������̨ -->
  <appender name="ConsoleAppender" type="log4net.Appender.ConsoleAppender">
    <layout type="log4net.Layout.PatternLayout">
	<conversionPattern value="%date [%thread] %-5level %logger [%property{NDC}] - %message%newline"/>
    </layout> 
  </appender>
  <!-- �����������־�ļ� -->
  <appender name="R" type="log4net.Appender.FileAppender" rollingStyle="Date" datePattern="yyyyMMdd-HH:mm:ss">
    <file value="logs/log.txt"></file>
    <appendToFile value="true"></appendToFile>
    <layout type="log4net.Layout.PatternLayout">
      <conversionPattern value="%-d{yyyy-MM-dd HH\:mm\:ss}  [%L] [%c]-[%p] %m%n"></conversionPattern> 
    </layout>
  </appender>
</log4net>
</configuration>
````
.cs�ļ�<br/>
````
/**
 * ָ��log4netʹ��.config�ļ�����ȡ������Ϣ
 * ��ΪWinform���ٶ�����ΪDemo.exe��, ��ô�����ļ���ΪDemo.exe.config
 * ��ΪWebform����Ϊweb.config
 */
[assembly:log4net.Config.XmlConfigurator(Watch=true)]
namespace Demo{
  public class MainClass{
    public static void Main(String[] args){
	ILog log = log4net.LogManager.GetLogger(MethodBase.GetCurrentMethod().DeclaringType);
        log.Error("error", new Exception("there is an exception"));
        log.Fatal("fatal", new Exception("there is a deadly exception occurs"));
	log.Info("info");
	log.Debug("debug");
	log.Warn("warn");
	Console.Read();
    }
  }
}
````

##��config�ļ�������
��`<configuration>`�ڵ�������`<configSections>`�ڵ�<br/>
````
<configSections>
  <section name="log4net" type="System.Configuration.IgnoreSectionHandler"/>
</configSections>
````
ֻ�����������ڵ㣬log4net.dll���ܶ�ȡconfig�ļ���`<log4net>�ڵ�`��������Ϣ<br/>

## ��ܵĺ������
**1. Appender**<br/>
���ã����ڶ�����־��Ϣ��������ʣ��ļ�������̨��Windows�¼���־�����ݿ⣨MSSQL��Acess��Oracle��DB2��SQLite�ȣ���<br/>
���õ�Appdner���:<br/>
`ConsoleAppender`���������Ϊ����̨<br/>
`FileAppender`���������Ϊ�ļ�<br/>
`EventLogAppender`���������Ϊϵͳ��־<br/>
`AdoNetAppender`���������Ϊ���ݿ�<br/>
�Զ���Appenderʱ����Ҫ�̳�`log4net.Appender.AppenderSkeleton`<br/>
**2. Layout**<br/>
���ã��������û���ʾ���յľ���ʽ���������Ϣ��<br/>
<span style="color:red;">ע�⣺һ��Appender������ܶ�Ӧһ��Layout����</span>
���ݵ�Layout���:<br/>
`PatternLayout`
�Զ���Layoutʱ����Ҫ�̳�`log4net.Layout.LayoutSkeleton`<br/>

**3. Appender Filter**<br/>
���ã�Ĭ�������Appender����Ὣ������־��Ϣ���������Ӧ�Ľ����У�ͨ��Appender Filter��������ռ䣺log4net.Filter�����԰��ղ�ͬ�ı�׼������־�¼������ݡ�<br/>
���õ�Filter�����<br/>

**4. Repository**<br/>
���ã�������־������֯�ṹ��ά�������ڷǿ����չ�ߣ����������õ��������<br/>

## ���÷�ʽ
1. ����������<br/>
2. �����ļ�<br/>

