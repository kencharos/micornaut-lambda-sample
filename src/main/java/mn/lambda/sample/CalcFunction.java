package mn.lambda.sample;

import io.micronaut.function.FunctionBean;

import java.util.function.Function;

@FunctionBean("calc")
public class CalcFunction implements Function<SampleRequest, SampleResponse> {

    @Override
    public SampleResponse apply(SampleRequest req) {

        SampleResponse res = new SampleResponse();
        res.setAnswer(req.getV1() + req.getV2());
        return res;
    }
}
