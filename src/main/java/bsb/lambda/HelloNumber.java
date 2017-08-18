package bsb.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import bsb.lambda.exception.MyException;

public class HelloNumber {

  public String handleRequest(String input, Context context) throws Exception {
    LambdaLogger logger = context.getLogger();
    logger.log("got the number: " + input);
    if (input.contains("error")) {
      throw new MyException("error requested");
    }
    return String.valueOf(input);
  }

}
