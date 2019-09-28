import { NextPage } from "next";
import { useEffect, useState } from "react";
import { fetch } from "../utils/fetch";
import styled from "@emotion/styled";

const Div = styled.div`
  margin: 10px;
`;

const Index: NextPage = () => {
  const [world, setWorld] = useState(null);

  useEffect(() => {
    const fetchWorld = async () => {
      const data = await fetch("helloworld");
      setWorld(data[0].hello_text);
    };

    fetchWorld();
  }, []);

  return <Div>Hello... {world}!</Div>;
};

export default Index;
