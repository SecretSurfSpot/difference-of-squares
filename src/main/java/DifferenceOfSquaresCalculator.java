class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
      int sum = 0;
      for (int i = 1; i < (input + 1); i++){
        sum += i;
      }
      return (int) Math.pow(sum, 2);
    }

    int computeSumOfSquaresTo(int input) {
      int sumOfSquares = 0;
      for (int i = 1; i < (input + 1); i++){
        sumOfSquares += (i * i);
      }
      return sumOfSquares;
    }

    int computeDifferenceOfSquares(int input) {
      return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }
}
