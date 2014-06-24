 /*************************************************************************
 *  2014 BHGAGILE
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of BHGAGILE.
 */
package com.bhgagile.neuralnet;

import static org.junit.Assert.assertEquals;

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

        final Neuron<Float, Float> neuron1 =
                        new NeuronImpl(new SumProcessor());

        final Neuron<Float, Float> neuron2 =
                        new NeuronImpl(new FlatValueProcessor(5.0f));

        neuron1.addUpstreamNeuron(neuron2);

        assertEquals("Unexpected output", 5.0f, neuron1.getOutput());
    }
}
