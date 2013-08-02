package hex;

import water.api.DocGen;

/**
 * Scalable K-Means++ (KMeans||)<br>
 * http://theory.stanford.edu/~sergei/papers/vldb12-kmpar.pdf<br>
 * http://www.youtube.com/watch?v=cigXAxV3XcY
 */
public class KMeans2 extends KMeansShared {
  static final int API_WEAVER = 1; // This file has auto-gen'd doc & json fields
  static public DocGen.FieldDoc[] DOC_FIELDS; // Initialized from Auto-Gen code.

  // This Request supports the HTML 'GET' command, and this is the help text
  // for GET.
  static final String DOC_GET = "Starts a job that runs the k-means algorithm";

  @API(help = "Number of clusters")
  @Input(required = true)
  int k;

  @API(help = "Maximum number of iterations before stopping")
  @Input
  int max_iter = 100;

  @API(help = "Iterations the algorithm ran")
  int iterations;

//  private transient Frame _frame;

  @Override protected void run() {
//
//    _frame = DKV.get(source_key).get();
//    // -1 to be different from all chunk indexes (C.f. Sampler)
//    Random rand = Utils.getRNG(seed - 1);
//    // Initialize first cluster to random row
//    double[][] clusters = new double[1][];
//
//    remove();
  }
}