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
 *
 */
public interface Neuron {

    /**
     * @param neuron neuron to add
     */
    void addUpstreamNeuron(Neuron neuron);

}
