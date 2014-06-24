 /*************************************************************************
 *  2014 BHGAGILE
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of BHGAGILE.
 */
package com.bhgagile.neuralnet;

import java.util.List;

/**
 * @author Barnaby Golden
 * @param <I> Input type
 * @param <O> Output type
 */
public interface Processor<I, O> {

    /**
     * Calculate the processor output given a list of upstream outputs.
     * @param outputs list of outputs fed to this processor
     * @return output
     */
    Output<O> process(List<Output<I>> outputs);
}
