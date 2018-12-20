package pl.Legia.model;

import java.util.Objects;

public class ProposalList {
    long proposalListId;
    long userUserId;
    long proposalProposalId;

    public ProposalList() {
    }

    public ProposalList(ProposalList proposalList) {
        this.proposalListId = proposalList.proposalListId;
        this.userUserId = proposalList.userUserId;
        this.proposalProposalId = proposalList.proposalProposalId;
    }

    public ProposalList(long proposalListId, long userUserId, long proposalProposalId) {
        this.proposalListId = proposalListId;
        this.userUserId = userUserId;
        this.proposalProposalId = proposalProposalId;
    }

    public long getProposalListId() {
        return proposalListId;
    }

    public void setProposalListId(long proposalListId) {
        this.proposalListId = proposalListId;
    }

    public long getUserUserId() {
        return userUserId;
    }

    public void setUserUserId(long userUserId) {
        this.userUserId = userUserId;
    }

    public long getProposalProposalId() {
        return proposalProposalId;
    }

    public void setProposalProposalId(long proposalProposalId) {
        this.proposalProposalId = proposalProposalId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProposalList)) return false;
        ProposalList that = (ProposalList) o;
        return proposalListId == that.proposalListId &&
                userUserId == that.userUserId &&
                proposalProposalId == that.proposalProposalId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(proposalListId, userUserId, proposalProposalId);
    }

    @Override
    public String toString() {
        return "ProposalList{" +
                "proposalListId=" + proposalListId +
                ", userUserId=" + userUserId +
                ", proposalProposalId=" + proposalProposalId +
                '}';
    }
}
