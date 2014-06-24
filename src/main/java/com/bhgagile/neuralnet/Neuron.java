 /*************************************************************************
 *  2014 BHGAGILE
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of BHGAGILE.
 */
package com.bhgagile.neuralnet;

/**
 * @author Barnaby Golden
 * @param <I> upstream neuron type
 * @param <O> output type
 */
public interface Neuron<I, O> {

    /**
     * @param neuron neuron to add
     */
    void addUpstreamNeuron(Neuron<?, I> neuron);

    /**
     * Run the processor and set the output.
     */
    void process();

    /**
     * Get the output from the neuron.
     * @return output
     */
    Output<O> getOutput();
}
