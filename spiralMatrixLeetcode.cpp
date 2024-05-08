//__________________________________________________// leetcode 54



//class Solution {
//public:
//     vector<int> spiralOrder(vector<vector<int>>& matrix) {
//         vector<int>ans;

//         int m = matrix.size();
//         int n = matrix[0].size();
//         int totalElements = m*n;
//         int count = 0;
        
//         int startRow = 0;
//         int startCol = 0;
//         int lastRow = m-1;
//         int lastCol = n-1;

//         while(count<totalElements){
//             //first row
//             for(int i = startCol; i <= lastCol && count<totalElements; i++){
//                 ans.push_back(matrix[startRow][i]);
//                 count++;
//             }
//             startRow++;

//             // last col
//             for(int i = startRow; i <= lastRow && count< totalElements;i++){
//                 ans.push_back(matrix[i][lastCol]);
//                 count++;
//             }
//             lastCol--;

//             //last Row
//             for(int i = lastCol; i >=startCol && count < totalElements; i--){
//                 ans.push_back(matrix[lastRow][i]);
//                 count++;
//             }
//             lastRow--;

//             //first col
//             for(int i = lastRow; i>=startRow && count < totalElements; i--){
//                 ans.push_back(matrix[i][startCol]);
//                 count++;
//             }
//             startCol++;
//         }
//         return ans;     
//     }
// };