import axios, { AxiosRequestConfig, AxiosResponse } from "axios";
import { getToken, removeToken } from "./token";

export const fetch = async <T = any>(
  route: string,
  data: any = {},
  method: AxiosRequestConfig["method"] = "GET"
): Promise<T> => {
  const authOptions: AxiosRequestConfig = {
    data: data,
    headers: {
      "x-access-token": getToken()
    },
    method,
    baseURL: `${process.env.API_ENDPOINT}/v1`,
    url: route
  };

  try {
    const response = await axios(authOptions).then(
      (res: AxiosResponse) => res.data
    );

    if (response.error && response.message === "Authentication Error") {
      removeToken();
    }

    return response;
  } catch (e) {
    return e;
  }
};
