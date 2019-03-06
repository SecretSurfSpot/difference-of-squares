class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
      int sumOfSquare = 0;
      for (int i = 1; i < (input + 1); i++){
        sumOfSquare += (i * i);
      }
      return sumOfSquare;
    }

    int computeSumOfSquaresTo(int input) {

      return 1;
    }

    int computeDifferenceOfSquares(int input) {
      return 1;
    }

}
