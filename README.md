Link Preview
============

Fork developed by <a href='https://github.com/broadbear' target='_blank'>@Broadbear</a>. 

This a version for Java of Leonardo Cardoso's web [Facebook Link Preview](http://lab.leocardz.com/facebook-link-preview-php--jquery/ "Facebook Link Preview").

It makes a preview from an url, grabbing all information. Such as title, relevant texts and images.

The goal of this fork is to create a version of Leonardo's link preview in Java that is independent of Android plumbing, and can be plugged into server-side projects built with a Java stack.

Note - Required Libs: [jsoup](http://jsoup.org/ "jsoup") to parse the html code.

## How to use with Gradle

Simply add the repository to your build.gradle file:
```groovy
repositories {
	jcenter()
	maven { url 'https://github.com/broadbear/maven-repo/raw/master' }
}
```

And you can use the artifacts like this:
```groovy
dependencies {
    compile 'org.jsoup:jsoup:1.8.3' // required
	compile 'org.broadbear:link-preview:1.2'
	// ...
}
```

Or download the jar (without dependencies) from:

<a href='https://github.com/broadbear/maven-repo/blob/master/org/broadbear/link-preview/1.2/link-preview-1.2.jar'>https://github.com/broadbear/maven-repo/blob/master/org/broadbear/link-preview/1.2/link-preview-1.2.jar</a>

## Usage

```java
TextCrawler.scrape([url string]);
```

Contact
=================================
If you are using this lib, let me know by contacting me at broadbear@gmail.com then I can add your app to this list


License
=================================

    Copyright 2013 Leonardo Cardoso

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
