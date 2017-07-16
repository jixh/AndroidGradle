#常规项目的gradle配置

##多IP地址切换，可以方便的切换Host地址

1，app/build.gradle 添加
```
    buildConfigField("String", "API_HOST", "\"http://google.com\"")

    productFlavors {

        TestInner {//测试库内网
              versionNameSuffix "-" + name
              applicationIdSuffix '.testinner'
              buildConfigField("String", "API_HOST", "\"http://192.168.3.19:8088\"")

        }

         TestOutter {//测试库外网
                    versionNameSuffix "-" + name
                    applicationIdSuffix '.testoutter'
                    buildConfigField("String", "API_HOST", "\"http://60.190.233.23:8080\"")

         }

```


2,编译后在自定义 Application中就可以使用了,在 buildvariants中可以方便的切换
```
    public class AppApplication extends Application {

        @Override
        public void onCreate() {
            super.onCreate();
            HostConstant.host = BuildConfig.API_HOST;
        }
    }

```

