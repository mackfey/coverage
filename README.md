# Triangle
Triangle is an example program for a software testing exercise that focuses on
unit testing and test effectiveness, using code coverage criteria.

#### How to build Triangle and run its tests from the terminal:

1. Change into the Triangle root directory, which contains the *build.xml* build
   file.

2. Run `ant compile` to compile Triangle. The compiled class files will be in
   the *bin* directory.

4. Run `ant test` to run all Triangle unit tests.

5. Run `ant clean` whenever you want to clean up the project (i.e., delete all
   generated files).

#### Code coverage analysis

1. Run `ant coverage` to compute the coverage results.

2. After completion, you can view the detailed html coverage report here:
   *coverage_results/index.html*

## Troubleshooting

#### Unit tests not running
The test target in the *build.xml* file is configured to (recursively) include
and run all *.java* files in the *test* folder as JUnit test suites.

+ Test suites placed elsewhere will not be run.

#### Outdated version of JUnit
If your system uses an outdated version of JUnit, you may encounter the
following error:
```
[junit] junit/framework/JUnit4TestAdapterCache
[junit] java.lang.NoClassDefFoundError: junit/framework/JUnit4TestAdapterCache
```
Run `ant -lib lib/ <target>` to explicitly use JUnit4, which is provided in the
*lib* directory. For example, run `ant -lib lib/ test` to run all unit tests.

#### Java JDK not installed or misconfigured
If a Java JDK is not installed or properly configured on your system, you may
encounter the following error: 
```
BUILD FAILED
build.xml:17 Unable to find a javac compiler;
```
Make sure that you have a JDK installed and that the JAVA_HOME environment
variable is properly set.
