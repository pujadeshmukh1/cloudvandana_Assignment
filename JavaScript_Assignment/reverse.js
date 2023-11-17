function reverseWords(sentence) {
  
  let words = sentence.split(" ");

  // Reverse each word
  let reversedWords = words.map((word) => reverseWord(word));

  let reversedSentence = reversedWords.join(" ");

  return reversedSentence;
}

function reverseWord(word) {
  
  return word.split("").reverse().join("");
}

let inputSentence = "This is a sunny day";
let reversedResult = reverseWords(inputSentence);
console.log(reversedResult);
