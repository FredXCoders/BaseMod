# Copy the students BaseMod.java into ${PWD}/artifacts, then run this script.

docker run -i --rm -v ${PWD}/artifacts:/artifacts fredxcoders/mod-build-env:latest /bin/bash << COMMANDS
cd /home
cp /artifacts/BaseMod.java src/main/java/com/fredxcoders/mod/BaseMod.java
./gradlew build
cp build/libs/modid-1.0.jar /artifacts/fredxcodersBaseMod.jar
#echo Changing owner from \$(id -u):\$(id -g) to $(id -u):$(id -u)
#chown -R $(id -u):$(id -u) /artifacts
COMMANDS
