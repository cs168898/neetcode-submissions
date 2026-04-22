class Solution {
    public boolean isValidSudoku(char[][] board) {
        /*  create 3 maps
            1st map: row , keys are row numbers, values are sets that contain existing values
            2nd map: col, keys are col numbers, values are sets that contain existing values
            3rd map: squares, keys are sub-boxes{(r/3),(c/3)}, values are sets that contain existing values

            then afterwards we use the computeIfAbsent() function that checks if key already exist, if not,
            create the set
        */
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<String, Set<Character>> squares = new HashMap<>();

        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board.length ; j++){

                
                
                Character currentNumber = board[i][j];

                if(currentNumber == '.') continue;
                // check if the key exists already, else create a set with it
                // also check if it contains the current number

                String squareKey = (i/3) + "," + (j/3);

                if (rows.computeIfAbsent(i, k -> new HashSet<>()).contains(currentNumber)||
                cols.computeIfAbsent(j, k -> new HashSet<>()).contains(currentNumber)||
                squares.computeIfAbsent(squareKey, k -> new HashSet<>()).contains(currentNumber)
                ){
                    return false;
                }

                rows.get(i).add(currentNumber);
                cols.get(j).add(currentNumber);
                squares.get(squareKey).add(currentNumber);
            }
        }

        return true;

    }
}