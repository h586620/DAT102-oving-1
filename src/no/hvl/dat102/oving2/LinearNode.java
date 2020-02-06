package no.hvl.dat102.oving2;

public class LinearNode <T> {

	//************************************************************
	///  Representerer en node.
	//************************************************************

	  private LinearNode<T> neste;
	  private T element;
	 
	  /**********************************************************
	    Oppretter en tom node
	  **********************************************************/
	  public LinearNode()  {
	    neste   =  null;
	    element = null;
	  }
	 
	  /**********************************************************
	    Oppretter en node med et element.
	  **********************************************************/
	  public LinearNode (T elem) {
	    neste   = null;
	    element = elem;
	  }
	 
	  /**********************************************************
	    Returnerer etterfølger.
	  **********************************************************/
	  public LinearNode<T> getNeste()  {
	    return neste;
	  }
	 
	  /**********************************************************
	    Setter neste til node
	  **********************************************************/
	  public void setNeste (LinearNode<T> node)  {
	    neste = node;
	  }
	 
	  /**********************************************************
	    Returnerer elementet til denne noden
	  **********************************************************/
	  public T getElement() {
	    return element;
	  }
	 
	  /**********************************************************
	    Setter nytt element i denne noden.
	  **********************************************************/
	  public void setElement (T elem) {
	    element = elem;
	  }

	public Object getTittel() {
		// TODO Auto-generated method stub
		return null;
	}

	}


