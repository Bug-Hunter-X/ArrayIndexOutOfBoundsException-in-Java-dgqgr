# ArrayIndexOutOfBoundsException in Java

This repository demonstrates a common Java error: the `ArrayIndexOutOfBoundsException`. This exception occurs when you try to access an array element using an index that is either negative or greater than or equal to the array's length.

The `bug.java` file contains the buggy code. The `bugSolution.java` file provides a corrected version.

## How to reproduce

1. Clone this repository.
2. Compile `bug.java` using a Java compiler.
3. Run the compiled code. You'll see the `ArrayIndexOutOfBoundsException`.

## Solution

The solution is to ensure that the index you are using to access an array element is within the valid range [0, array.length - 1].  The `bugSolution.java` file demonstrates this by adding error handling and boundary checks.