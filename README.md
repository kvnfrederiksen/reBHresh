You must package wrappers prior to running soaptester. JARs that are outputed from wrappers are required by soaptester.
```
cd wrappers
mvn package
```

then you cna build soaptester
```
cd soaptester
mvn package
```

Then you can run soaptester
```
cd soaptester/target
java -jar soaptester-1.0-SNAPSHOT.jar ../../config.json
```


Update config.json to match the SL you are testing