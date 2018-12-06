package mn.lambda.sample;

import javax.inject.Singleton;

/**
 * Function sample
 */
@Singleton
public class CalculationService {

    public SampleResponse calc(SampleRequest req) {
        SampleResponse res = new SampleResponse();
        res.setAnswer(req.getV1() + req.getV2());
        return res;
    }

}
