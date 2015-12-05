#GeoQuiz  
功能:测试用户的地理知识  

布局整体居中，通过`android:gravity="center"`来设置，并垂直居中，中间再用LinearLayout来实现水平，垂直进行局部布局。  

TrueFalse作为模型类:存放问题的id和答案。  

QuizActivity类  
初始化问题,设置监听器，根据用户选择，通过Toast来显示正确或错误  

![alt 展示图](https://github.com/AronGuan/androidProject/blob/master/images/GeoQuiz.PNG)

屏幕旋转保留数据  

layout-land文件夹重新写布局文件  


可以看答案，但是返回后不能再回答(防止作弊)  
通过startActivityForResult返回信息。  

解决挑战练习  
1. 可通过旋转来清楚作弊痕迹  
2. 用户不断单击Next按钮，知道再次遇到偷看过答案的问题  

屏幕旋转保留数据  

layout-land文件夹重新写布局文件  


可以看答案，但是返回后不能再回答(防止作弊)  
通过startActivityForResult返回信息。  

解决挑战练习  
1. 可通过旋转来清楚作弊痕迹  
2. 用户不断单击Next按钮，知道再次遇到偷看过答案的问题  

![alt 展示图](https://github.com/AronGuan/androidProject/blob/master/images/cheat.PNG)