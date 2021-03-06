package info.weboftrust.ldsignatures.suites;

import java.net.URI;

public abstract class SignatureSuite {

	public static final URI URI_TYPE_SIGNATURESUITE = URI.create("https://w3id.org/security#SignatureSuite");

	private String term;
	private URI id;
	private URI type;
	private URI canonicalizationAlgorithm;
	private URI digestAlgorithm;
	private URI proofAlgorithm;

	public SignatureSuite(String term, URI id, URI canonicalizationAlgorithm, URI digestAlgorithm, URI proofAlgorithm) {

		this.term = term;
		this.id = id;
		this.type = URI_TYPE_SIGNATURESUITE;
		this.canonicalizationAlgorithm = canonicalizationAlgorithm;
		this.digestAlgorithm = digestAlgorithm;
		this.proofAlgorithm = proofAlgorithm;
	}

	public String getTerm() {
		return term;
	}

	public URI getId() {
		return id;
	}

	public URI getType() {
		return type;
	}

	public URI getCanonicalizationAlgorithm() {
		return canonicalizationAlgorithm;
	}

	public URI getDigestAlgorithm() {
		return digestAlgorithm;
	}

	public URI getProofAlgorithm() {
		return proofAlgorithm;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((canonicalizationAlgorithm == null) ? 0 : canonicalizationAlgorithm.hashCode());
		result = prime * result + ((digestAlgorithm == null) ? 0 : digestAlgorithm.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((proofAlgorithm == null) ? 0 : proofAlgorithm.hashCode());
		result = prime * result + ((term == null) ? 0 : term.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SignatureSuite other = (SignatureSuite) obj;
		if (canonicalizationAlgorithm == null) {
			if (other.canonicalizationAlgorithm != null)
				return false;
		} else if (!canonicalizationAlgorithm.equals(other.canonicalizationAlgorithm))
			return false;
		if (digestAlgorithm == null) {
			if (other.digestAlgorithm != null)
				return false;
		} else if (!digestAlgorithm.equals(other.digestAlgorithm))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (proofAlgorithm == null) {
			if (other.proofAlgorithm != null)
				return false;
		} else if (!proofAlgorithm.equals(other.proofAlgorithm))
			return false;
		if (term == null) {
			if (other.term != null)
				return false;
		} else if (!term.equals(other.term))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SignatureSuite [term=" + term + ", id=" + id + ", type=" + type + ", canonicalizationAlgorithm="
				+ canonicalizationAlgorithm + ", digestAlgorithm=" + digestAlgorithm + ", proofAlgorithm="
				+ proofAlgorithm + "]";
	}
}
