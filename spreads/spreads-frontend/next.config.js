require("dotenv").config();

module.exports = {
  env: {
    API_ENDPOINT: process.env.API_ENDPOINT
  },
  webpackDevMiddleware: config => {
    config.watchOptions = {
      poll: 1000,
      aggregateTimeout: 300
    };
    return config;
  }
};
