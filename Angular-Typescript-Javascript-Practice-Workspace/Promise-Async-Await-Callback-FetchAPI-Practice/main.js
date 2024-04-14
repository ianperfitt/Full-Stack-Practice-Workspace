// Fetch API requires a discussion of...
// Callbacks, Promises, Thenables, and Async/Await

// Promises

// 3 states: Pending, Fulfilled, Rejected

const users = fetch("https://jsonplaceholder.typicode.com/users");

// pending
console.log(users);

fetch("https://jsonplaceholder.typicode.com/users")
.then(response => {
  return response.json();
})
.then(data => {
  data.array.forEach(user => {
    console.log(user);
  });
});