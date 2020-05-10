### Run
naive:
```bash
$ rm -rf factory/build/classes/*; javac factory/src/naive/FileReader.java -d factory/build/classes/; javac -cp factory/build/classes/ factory/src/naive/impl/JavaFileReader.java -d factory/build/classes/; javac -cp factory/build/classes/ factory/src/App.java -d factory/build/classes/; java -cp factory/build/classes/ App "hello.java"
```
