- git 中的配置文件必须位于 git repo直接的文件夹下,不能有嵌套文件夹

/{application}/{profile}[/{label}]  
/{application}-{profile}.yml    
/{label}/{application}-{profile}.yml    
/{application}-{profile}.properties     
/{label}/{application}-{profile}.properties 

``
上面的url会映射{application}-{profile}.properties对应的配置文件， 
其中{label}对应Git上不同的分支，默认为master。 
我们可以尝试构造不同的url来访问不同的配置内容，比如，要访问master分支，    
config-client应用的dev环境，就可以访问这个   
url：http://localhost:1201/config-client/dev/master
``