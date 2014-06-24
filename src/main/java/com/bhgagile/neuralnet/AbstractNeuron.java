 /*************************************************************************
 *  2014 BHGAGILE
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of BHGAGILE.
 */
package com.bhgagile.neuralnet;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Barnaby Golden
 *
 * @param <I> Input type
 * @param <O> Output type
 */
public abstract class AbstractNeuron<I, O> implements Neuron<I, O> {

    /**
     * Processor.
     */
    private final Processor<I, O> processor;
    /**
     * List of upstream neurons.
     */
    private final List<Neuron<?, I>> upstreamNeurons;
    /**
     * Output from the neuron.
     */
    private Output<O> output;

    /**
     * Processor is required for construction.
     * @param processor processor
     */
    public AbstractNeuron(final Processor<I, O> processor) {

        this.processor = processor;

        upstreamNeurons = new ArrayList<Neuron<?, I>>();
    }

    /**
     * Get processor for neuron.
     * @return processor
     */
    public final Processor<I, O> getProcessor() {
        return processor;
    }


    /**
     * {@inheritDoc}
     */
    public final void addUpstreamNeuron(final Neuron<?, I> neuron) {

        upstreamNeurons.add(neuron);
    }

    /**
     * Get the list of upstream inputs.
     * To be used by the processor when calculating output.
     * @return list of upstream inputs
     */
    protected final List<Output<I>> getUpstreamInputs() {

        final List<Output<I>> list = new ArrayList<Output<I>>();

        for (Neuron<?, I> upInp: upstreamNeurons) {
            upInp.process();
            list.add(upInp.getOutput());
        }

        return list;
    }

    /**
     * {@inheritDoc}
     */
    public final Output<O> getOutput() {
        return output;
    }

    /**
     * Set the output.
     * @param output output
     */
    protected final void setOutput(final Output<O> output) {
        this.output = output;
    }
}
