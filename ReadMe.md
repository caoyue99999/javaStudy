# Git常用指令总结

Git是目前世界上最先进的分布式版本控制系统(没有之一)，什么是版本控制？大白话就是可以控制`每个人每一次提交`，保证`代码互不干扰`，可进行`历史记录查询`、`回退版本`、`分支合并`，极大的提高了协同开发的效率。

### 1. git原理？（重要）
* 本地缓存：一般指git clone后的状态，即将代码缓存cache到本地
* 暂存区：一般指git add之后的状态，即将代码添加至暂存区
* 本地仓库：一般指git commit之后的状态，即将代码提交到本地仓库
* 远端仓库：一般指git push之后的状态，即将代码推送到在远端仓库

### 2. git指令

#### (1) 查看
#### 查看所有分支

```
git branch -a
```


#### 查看分析信息
```
git branch -v
```


#### 查看本地分支与远程分支关系
```
git branch -vv
```


#### 查看本地与上一次暂存区的差异
```
git status
```


#### 查看文件与上一次暂存区的差异。假设文件为test.py
```
git diff test.py
```


#### 查看本地与远端仓库分支分支映射是否异常
```
git remote show origin
```


#### 查看本地缓存序列
```
git stash list
```


#### 查看stash缓存具体内容，数字0代表序列为0的缓存
``` 
git stash show stash@{0}
```


#### 查看所在分支历史提交记录
```
git log
```


#### 查看文件在git中的跟踪状态
```
git status -sb
```

[详细参考](https://blog.csdn.net/weixin_49278803/article/details/120153217)





# java开发笔记

GitHub保存的Java可开发笔记

包含了：

* Java基础知识

* 反射

