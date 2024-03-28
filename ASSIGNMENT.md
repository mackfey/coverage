# In-class exercise Coverage-based testing: Set up

1. **Make sure [Apache Ant](http://ant.apache.org/)**,
a **[Java 8 or 11 or 17 JDK](https://www.oracle.com/java/technologies/downloads)**,
and **[Git](https://git-scm.com/) are installed**.
(The [set-up tips for Ant](ant_guide.html) may be useful.)
The required software is already installed on attu.cs.washington.edu, if you prefer to do the exercise there.

2. **Clone** the following **git repository** and read its `README.md` file:
     [https://bitbucket.org/rjust/coverage](https://bitbucket.org/rjust/coverage)

3. **Test** your **set up**: **compile** and **test** the Triangle program.

4. **Compute the coverage report**: run `ant coverage` and view the coverage report.
   If you do the exercise on Attu, review the [set-up tips for Attu](attu_coverage_guide.html)
   to serve the html coverage report computed on Attu.


# In-class exercise Coverage-based testing: Instructions

## High-level goal
The high-level goals of this exercise are to (1) learn about systematic unit
testing and (2) reason about test quality, using code coverage criteria.

## Setup

1. Make sure
a **[Java JDK](https://www.oracle.com/java/technologies/downloads)**
and **[Git](https://git-scm.com/) are installed**.

2. Clone the following git repository and read its `README.md` file and `ASSIGNMENT.md` file:
     [https://bitbucket.org/rjust/coverage](https://bitbucket.org/rjust/coverage)

3. Test your setup: compile and test the Triangle program.

4. Compute the coverage report, per the instructions in the [README.md](README.md) file.

## Instructions

0. **Read the entire assignment and ask any clarifying questions that you might have.**

### Coverage-based testing

1. Familiarize yourself with the triangle program (`src/triangle/Triangle.java`). 

2. Familiarize yourself with the example test suite (`test/triangle/TriangleTest.java`).

3. Run `ant coverage` and then **inspect** the coverage report it generates: `coverage_results/index.html`.

5. Develop **4 test suites** (i.e., add tests to the `testTable` method in `TriangleTest.java`)
   that satisfy the following coverage criteria:
    * **SC**: Statement coverage
    * **DC**: Decision coverage
    * **CC**: Condition coverage
    * **MCDC**: Modified condition and decision coverage
    
    You may reuse tests between test suites.
    **For each test suite**, make a **commit and tag it** 
    (i.e., `git commit` followed by `git tag`; use SC, DC, CC, and MCDC as tag names).

5. Skip the dummy test (i.e., add an `@Ignore` annotation to the testDummy
   method) and regenerate the coverage report. (Note the difference in the
   coverage report, which is related to question 1 below.)

## Questions
1. Jacoco instruments the Java byte code for measuring code coverage.

   a. For the purpose of measuring code coverage, state two advantages for
      instrumenting source code and two advantages for instrumenting
      Java byte code or an intermediate representation more generally.

   b. Which instrumentation approach is preferable? Briefly explain why?

2. Which coverage criterion does Jacoco’s branch coverage correspond to? Why?

3. Give a definition of "*test redundancy*", using a code coverage criterion and
   provide an example of a redundant test for one of your test suites
   (explicitly state which existing test in your test suite is redundant with
   the example you provide).
   Given your definition of test redundancy, would you remove redundant tests
   from an existing test suite? Briefly explain why or why not.

4. Consider the following two, functionally equivalent code snippets
   (a, b, and c are boolean inputs):

   Version 1
   ```
   o1 = (a | b) & c
   ```

   Version 2
   ```
   t1 = a | b
   o2 = t1 & c
   ```

   a. Provide a **minimum** MCDC-adequate test suite for each Version.

   b. For each of the two test suites, is it MCDC-adequate for the other version?

   c. Can you create two MCDC-adequate test suites of equal size -- one being
      adequate for Version 1 and one being adequate for Version 2 but not
      Version 1?

   d. Summarize your observations from the three prompts above (4a--4c) and
      briefly discuss guarantees and/or implications w.r.t. adequacy and code
      structure.

## Deliverables
1. A plain-text file (or PDF) with your answers to the four questions above. Please list all group members.

2. An archive (zip) of your git repository (compressed .git folder), which
   contains the four tagged commits for your developed test suites.

### Steps for turn-in
One team member should upload the deliverables to Canvas, via the [Canvas submission site](https://canvas.uw.edu/courses/1623674/assignments/7745883) for this course.

## Hints
* To avoid spurious results and confusion, it is a good idea to **run**
  `ant clean test` to make sure that your added **tests pass** before
  computing coverage.
