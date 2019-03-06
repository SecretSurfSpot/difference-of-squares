class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
      int sum = 0;
      int squareOfSum = 0;
      for (int i = 1; i < (input + 1); i++){
        sum += i;
        System.out.println("sum is: " + sum);
      }

      return squareOfSum = sum * sum;
    }

    int computeSumOfSquaresTo(int input) {
      int sumOfSquares = 0;
      for (int i = 1; i < (input + 1); i++){
        sumOfSquares += (i * i);
        System.out.println("sumOfSquares is: " + sumOfSquares);
      }
      return sumOfSquares;
    }

    int computeDifferenceOfSquares(int input) {
      return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
