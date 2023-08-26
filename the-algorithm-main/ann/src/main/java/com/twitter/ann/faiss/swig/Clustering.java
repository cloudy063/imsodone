/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.twitter.ann.faiss;

public class Clustering extends ClusteringParameters {
  private transient long swigCPtr;

  protected Clustering(long cPtr, boolean cMemoryOwn) {
    super(swigfaissJNI.Clustering_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Clustering obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        swigfaissJNI.delete_Clustering(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setD(long value) {
    swigfaissJNI.Clustering_d_set(swigCPtr, this, value);
  }

  public long getD() {
    return swigfaissJNI.Clustering_d_get(swigCPtr, this);
  }

  public void setK(long value) {
    swigfaissJNI.Clustering_k_set(swigCPtr, this, value);
  }

  public long getK() {
    return swigfaissJNI.Clustering_k_get(swigCPtr, this);
  }

  public void setCentroids(FloatVector value) {
    swigfaissJNI.Clustering_centroids_set(swigCPtr, this, FloatVector.getCPtr(value), value);
  }

  public FloatVector getCentroids() {
    long cPtr = swigfaissJNI.Clustering_centroids_get(swigCPtr, this);
    return (cPtr == 0) ? null : new FloatVector(cPtr, false);
  }

  public void setIteration_stats(SWIGTYPE_p_std__vectorT_faiss__ClusteringIterationStats_t value) {
    swigfaissJNI.Clustering_iteration_stats_set(swigCPtr, this, SWIGTYPE_p_std__vectorT_faiss__ClusteringIterationStats_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__vectorT_faiss__ClusteringIterationStats_t getIteration_stats() {
    long cPtr = swigfaissJNI.Clustering_iteration_stats_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__vectorT_faiss__ClusteringIterationStats_t(cPtr, false);
  }

  public Clustering(int d, int k) {
    this(swigfaissJNI.new_Clustering__SWIG_0(d, k), true);
  }

  public Clustering(int d, int k, ClusteringParameters cp) {
    this(swigfaissJNI.new_Clustering__SWIG_1(d, k, ClusteringParameters.getCPtr(cp), cp), true);
  }

  public void train(long n, SWIGTYPE_p_float x, Index index, SWIGTYPE_p_float x_weights) {
    swigfaissJNI.Clustering_train__SWIG_0(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x), Index.getCPtr(index), index, SWIGTYPE_p_float.getCPtr(x_weights));
  }

  public void train(long n, SWIGTYPE_p_float x, Index index) {
    swigfaissJNI.Clustering_train__SWIG_1(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x), Index.getCPtr(index), index);
  }

  public void train_encoded(long nx, SWIGTYPE_p_unsigned_char x_in, Index codec, Index index, SWIGTYPE_p_float weights) {
    swigfaissJNI.Clustering_train_encoded__SWIG_0(swigCPtr, this, nx, SWIGTYPE_p_unsigned_char.getCPtr(x_in), Index.getCPtr(codec), codec, Index.getCPtr(index), index, SWIGTYPE_p_float.getCPtr(weights));
  }

  public void train_encoded(long nx, SWIGTYPE_p_unsigned_char x_in, Index codec, Index index) {
    swigfaissJNI.Clustering_train_encoded__SWIG_1(swigCPtr, this, nx, SWIGTYPE_p_unsigned_char.getCPtr(x_in), Index.getCPtr(codec), codec, Index.getCPtr(index), index);
  }

  public void post_process_centroids() {
    swigfaissJNI.Clustering_post_process_centroids(swigCPtr, this);
  }

}