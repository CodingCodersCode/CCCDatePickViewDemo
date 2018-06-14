# CCCDatePickViewDemo
日期选择控件

本项目为基于[brucetoo/PickView 1.2.3版本](https://github.com/brucetoo/PickView)修改而成。

在[brucetoo/PickView 1.2.3版本](https://github.com/brucetoo/PickView)基础上，根据自身项目实际需求，添加了对最小月份、最大月份、最小日期、最大日期的自定义设置。

使用方法完全与[brucetoo/PickView 1.2.3版本](https://github.com/brucetoo/PickView)相同。

新增的方法为：`minMonth()`、`maxMonth()`、`minDay()`、`maxDay()`。

# 使用方式

`gradle`

- Step 1. Add the JitPack repository to your build file, Add it in your root `build.gradle` at the end of repositories:
      
      allprojects {
        repositories {
          ...
          maven { url 'https://jitpack.io' }
        }
      }
     
- Step 2. Add the dependency:
   
      dependencies {
              implementation 'com.github.CodingCodersCode:CCCDatePickViewDemo:v1.1'
      }
