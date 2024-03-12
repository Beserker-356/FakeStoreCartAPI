<h1>Shopping Cart using FakeStore API<h1>

<h2>Description</h2>
<p>This project creates a clone of online shopping cart using FakeStore API in Springboot Java. It only has backend functionalities.</p>

<h2>Prerequisites</h2>
<ul>
  <li>Java 21</li>
  <li>IntelliJ by JetBrains</li>
  <li>Postman</li>
</ul>

<h2>Funtionalities</h2>
<p>Copy the whole folder or clone the repo to make it available locally. Now, open the folder in IntelliJ. Run the "OopsProjectApplication.java" file in IntelliJ. Now, launch Postman</p>

<h3>Get a single cart</h3>
<p>Enter "http://localhost:8080/carts/1" (You can also send different numbers as id in place of 1.) in the input area and make sure that GET method is selected. Enter Send. The cart with the passed id will be fetched.</p>

![Screenshot from 2024-03-12 17-08-16](https://github.com/Beserker-356/FakeStoreCartAPI/assets/141203631/46a0948b-1baa-49bb-845d-ebae2830c516)

<h3>Get a all carts</h3>
<p>Enter "http://localhost:8080/carts" in the input area and make sure that GET method is selected. Enter send. All the carts will be fetched.</p>

![Screenshot from 2024-03-12 17-09-52](https://github.com/Beserker-356/FakeStoreCartAPI/assets/141203631/42c1186f-25ef-4be0-bfb5-b3cf40946884)

<h3>Get carts in certain date range</h3>
<p>Enter "http://localhost:8080/carts/2020-01-01/2020-02-02" (You can also send different strings as date in place of 2020-01-01(start date) and 2020-02-02(end date).) in the input area and make sure that GET method is selected. Enter Send. All the carts within the date range will be fetched.</p>

![Screenshot from 2024-03-12 17-16-51](https://github.com/Beserker-356/FakeStoreCartAPI/assets/141203631/ac02d589-e8a9-4978-962e-221fc6dc2cb8)

<h3>Get carts of a user</h3>
<p>Enter "http://localhost:8080/carts/user/1" (You can also send different numbers as userId in place of 1.) in the input area and make sure that GET method is selected. Enter Send. All the carts of the given user will be fetched.</p>

![Screenshot from 2024-03-12 17-21-54](https://github.com/Beserker-356/FakeStoreCartAPI/assets/141203631/e73c9eff-9f71-4c61-99fb-63b0c7d6a6fa)
