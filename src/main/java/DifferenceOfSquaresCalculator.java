class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
      int squareOfSum = 0;
      for (int i = 1; i < (input + 1); i++){
        squareOfSum += i;
        System.out.println("squareOfSum is: " + squareOfSum);
      }
      return squareOfSum * squareOfSum;
    }

    int computeSumOfSquaresTo(int input) {
      int sumOfSquares = 0;
      for (int i = 1; i < (input + 1); i++){
        sumOfSquares += (i * i);
      }
      return sumOfSquares;
    }

    int computeDifferenceOfSquares(int input) {
      return 1;
    }

}
