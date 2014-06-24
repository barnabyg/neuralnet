 /*************************************************************************
 *  2014 BHGAGILE
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of BHGAGILE.
 */
package com.bhgagile.neuralnet;

import org.junit.Test;

/**
 * @author Barnaby Golden
 *
 */
public final class NeuronTest {

    /**
     * Neuron processing.
     */
    @Test
    public void neuronProcess() {

        final Neuron neuron1 = new NeuronImpl(new SumProcessor());

        final Neuron neuron2 = new NeuronImpl(new FlatValueProcessor(5.0f));

        neuron1.addUpstreamNeuron(neuron2);
    }
}
