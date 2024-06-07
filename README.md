# cairo-plugin

## Introduction
This project supports the Cairo language in IDEA Ultimate Edition through a language server.

## features
These features are available for free with IntelliJ IDEA Ultimate Edition:
<li>highlighting</li>
<li>completion</li>
<li>formatting</li>
<li>hover</li>
<li>goto definition</li>


## Installation

Before using this plugin, Ensure that the executable ''scarb-cairo-language-server"(mac/linux) or 'scarb-cairo-language-server.exe'(windows) exists in the operating system. Typically, it should be in the same directory as the executable 'scarb.exe' or 'scarb'.

You can also find the corresponding version of Scarb and the operating system on this. Download the compressed package, unzip it, and locate 'scarb-cairo-language-server' after extraction.

Mac/Linux

    1 Change the permissions of the executable 'scarb-cairo-language-server' to 777.

    2 Install this plugin

    3 Enter "Cairo Analyzer Settings" by selecting "Intellij IDEA -> preferences -> Tools -> Cairo Analyzer Setting".

    4 Enter the local address of the language server and corelib, such as "/Users/UserName/SomePath/cairo-language-server" and "/Users/UserName/SomePath/corelib"

    5 Allow the execution of cairo-language-server in System Preferences and grant permissions in IntelliJ IDEA on macOS

    6 Restart IDEA.

Note:Using absolute paths, not relative paths or symbols like '~'.

Windows

    1 Install this plugin

    2 Enter "Cairo Analyzer Settings" by selecting "File -> Settings -> Tools -> Cairo Analyzer Setting".

    3 Enter the local address of the language server and corelib, such as "C:\Users\UserName\SomePath\cairo-language-server.exe" and "C:\Users\UserName\SomePath\corelib"

    4 Restart IDEA.

Note:Using absolute paths, not relative paths or symbols like '~'.

## Lastest Update
#### 1. Supported more syntax highlighting
<li>macro functions</li>
<li>types and generics in structures declaration</li>

## ToDo List
#### 1. Supported more syntax highlighting `next version`
<li>Constant highlighting</li>
<li>use statement highlighting</li>
<li>Single-quote string highlighting</li>
<li>Traits highlighting</li>

#### 2. StructView
#### 3. Brace Matching
#### 4. Folding Code
#### 5. Feature Switch in Setting
#### 6. Inlay Hints
