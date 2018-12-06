package mn.lambda.sample;

import io.micronaut.function.FunctionBean;

import javax.inject.Inject;
import java.util.function.Function;

@FunctionBean("calc")
public class CalcFunction implements Function<SampleRequest, SampleResponse> {

    @Inject CalculationService service;

    @Override
    public SampleResponse apply(SampleRequest req) {
      return service.calc(req);
    }
}
