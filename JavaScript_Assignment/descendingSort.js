function descendingSort(array) {
  for (let i = 0; i < array.length - 1; i++) {
    for (let j = i + 1; j < array.length; j++) {
      if (array[i] < array[j]) {
        // Swap the elements 
        let temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
    }
  }
}


let inputArray = [5, 2, 8, 1, 3];
descendingSort(inputArray);
console.log("Sorted Array in Descending Order:", inputArray);
