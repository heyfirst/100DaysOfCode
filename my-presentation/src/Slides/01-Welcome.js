import React from "react";
import styled from "styled-components";
import {
  BlockQuote,
  Cite,
  Deck,
  Heading,
  ListItem,
  List,
  Quote,
  Slide,
  Text
} from "spectacle";

const Welcome = () => (
  <React.Fragment>
    <Heading size={6} fit caps lineHeight={1} textColor="secondary">
      Styled Components in React
    </Heading>
    <Text margin="10px 0 0" textColor="tertiary" fit bold>
      Another way to style your component
    </Text>
  </React.Fragment>
);

export default Welcome;
