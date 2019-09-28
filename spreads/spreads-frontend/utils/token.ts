let localStorage = null;

if (typeof window !== "undefined") {
  localStorage = window.localStorage;
}

export const getToken = (): string => {
  return localStorage.getItem("spreads-access-token") || "";
};

export const setToken = (token: string) => {
  localStorage.setItem("spreads-access-token", token);
};

export const removeToken = () => {
  localStorage.removeItem("spreads-access-token");
};
