package water.api;

import hex.drf.DRF.DRFModel;
import water.*;

public class DRFModelView extends Request2 {
  static final int API_WEAVER = 1; // This file has auto-gen'd doc & json fields
  static public DocGen.FieldDoc[] DOC_FIELDS; // Initialized from Auto-Gen code.

  @API(help="DRF Model Key", required=true, filter=DRFModelKeyFilter.class)
  Key _modelKey;
  class DRFModelKeyFilter extends H2OKey { public DRFModelKeyFilter() { super("model_key",true); } }

  @API(help="DRF Model")
  DRFModel drf_model;

  public static Response redirect(Request req, Key modelKey) {
    return Response.redirect(req, "/2/DRFModelView", "_modelKey", modelKey);
  }

  @Override public boolean toHTML(StringBuilder sb){
    drf_model.generateHTML("DRF Model", sb);
    return true;
  }

  @Override protected Response serve() {
    drf_model = UKV.get(_modelKey);
    if (drf_model == null) return Response.error("Model '" + _modelKey + "' not found!");
    else return Response.done(this);
  }
}
