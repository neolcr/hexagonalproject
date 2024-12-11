import http from 'k6/http';
import { sleep } from 'k6';

export const options = {
  stages: [
    { duration: '30s', target: 10 }, // Ramp up to 10 users in 30 seconds
    { duration: '1m', target: 10 }, // Stay at 10 users for 1 minute
    { duration: '10s', target: 0 }, // Ramp down to 0 users in 10 seconds
  ],
};

export default function () {
  const res = http.get('http://localhost:8080/kotlin/example/all'); // Replace with your API endpoint
  if (res.status !== 200) {
    console.error(`Non-200 status code received: ${res.status}`);
  }
  sleep(1); // Simulate think time between requests
}
